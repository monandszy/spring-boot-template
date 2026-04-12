.PHONY: build run test clean up down deploy

all: build

build:
	cd app && ./gradlew build -x test

test:
	cd app && ./gradlew test

clean:
	cd app && ./gradlew clean

run:
	cd app && ./gradlew bootRun

up:
	cd infra && docker-compose -p net -f compose-networking.yml up -d
	cd infra && docker-compose -p data -f compose-data.yml up -d
	cd infra && docker-compose -p obs -f compose-observability.yml up -d

down:
	cd infra && docker-compose -p net -f compose-networking.yml down
	cd infra && docker-compose -p data -f compose-data.yml down
	cd infra && docker-compose -p obs -f compose-observability.yml down

# Build and deploy the app
deploy: build
	cd app && docker-compose -p app-deploy -f compose.yml up -d --build