# Github Flow (A branch based workflow)
`https://docs.github.com/en/get-started/using-github/github-flow`

## The core

### Always update (fetch) master branch before.
- `git checkout master`
- `git pull`

### Create a branch for your work:
- For features: `git checkout -b feat/<name>`
- For bug fixes: `git checkout -b fix/<name>`

### Register your branch in the online repo
- `git push -u origin <branch-name>`

### Working... 
To stay in sync with the team while on the feature branch:
- `git fetch origin`
- `git merge master or git rebase master`
- `git push`

### Submit your changes for review:
- `<repo_url>/pull/new/<branch-name>`
- Squash merge the feature branch into master.

### Why?
- **Isolation:** Work is kept separate from the `master` branch, ensuring that broken or unfinished code is never deployed to production.
- **Collaboration & Quality Control:** Pull Requests (PRs) create a dedicated space for peer code reviews, discussion, and automated testing (CI/CD) before code is integrated.
- **Conflict Prevention:** Regularly syncing with `master` (`fetch`/`rebase`) resolves integration issues in small, manageable chunks rather than resulting in massive merge conflicts at the end of a sprint.
- **Clean History:** By using "Squash and Merge," all the messy WIP (work-in-progress) commits of a feature branch are condensed into a single, comprehensive commit on `master`. This keeps the main history readable and makes rolling back a broken feature much easier.

---

## Conventional commits (Commit format)
https://www.conventionalcommits.org/en/v1.0.0/

### Commit format
  `<type>[optional scope]: <description>`

  type: fix, feat, ref, chore, docs, test, merge, rebase
  - example: `fix: <...>`
  
  scope: `(<module-name>)` or `!` (breaking change)
  - example: `feat(auth)!: <...>`

  Before implementation think which **type** and **scope** will fit the code you are going to implement.

  Ideally, each commit contains an isolated, complete change.

### Why?
- **Clear Communication:** Instantly communicates the nature of changes to teammates, stakeholders, and open-source contributors without them needing to read the actual code diff.
- **Easier Debugging:** When a bug is introduced, a structured history allows developers to quickly scan for recent `feat` or `ref` commits in a specific `scope`.
- **Automation:** Enables seamless integration with tooling. Release versioning (feat: for MINOR, fix: for PATCH) and changelog generation can be fully automated.

---

## Github Config 
### Settings -> General
  - Check: "Allow squash merging"
  - Uncheck: "Allow merge commits", "Allow rebase merging"
### Settings > Branches -> Add classic branch protection rule
  - Branch name pattern: master (or main, check default in repo)
  - Protect matching branches -> Check:
    - "Require a pull request before merging"
    - "Require approvals"
    - "Dismiss stale pull request approvals when new commits are pushed"
  - Check: "Require linear history", "Do not allow bypassing the above settings"

### Why?
- **Enforcing the Process:** Human error is inevitable. Branch protection rules physically prevent developers from accidentally pushing unreviewed code directly to `master`.
- **Enforcing Linear History:** Disabling standard merge commits and enforcing squash merging guarantees a "linear history." This means the `master` branch reads like a clean, chronological story of features and fixes, rather than a tangled web of branching paths and redundant merge commits.
