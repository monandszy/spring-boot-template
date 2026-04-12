.PHONY: build run test clean up down deploy

all: build

build:
	cd app && gradlew build -x test

up:
	cd infra && docker-compose -p net -f compose-networking.yml up -d
	cd infra && docker-compose -p data -f compose-data.yml up -d
	cd infra && docker-compose -p obs -f compose-observability.yml up -d

down:
	cd infra && docker-compose -p net -f compose-networking.yml down
	cd infra && docker-compose -p data -f compose-data.yml down
	cd infra && docker-compose -p obs -f compose-observability.yml down

deploy: build
	cd app && docker-compose -p app -f compose.yml up -d --build