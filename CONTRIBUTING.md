## Applying api changes

1. navigate to the subproject(s) matching the api version(s) to be changed
2. update the `docker-engine-api-v<VERSION>.yaml`
3. execute in the project's root directory: `./gradlew :api-model-v<VERSION>:updateApiModelSources`
4. verify the code changes, e.g. using `git status` or `git diff`
5. perform checks: `./gradlew check`
6. push the changes to your fork and submit a pull request (see [GitHub's documentation](https://docs.github.com/en/get-started/quickstart/contributing-to-projects) for help about contributing to a project)
