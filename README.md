[![Build Status](https://img.shields.io/github/actions/workflow/status/docker-client/docker-remote-api/cd.yml?branch=main&style=for-the-badge)](https://github.com/docker-client/docker-remote-api/actions)
[![Maven Central](https://img.shields.io/maven-central/v/de.gesellix/docker-remote-api-model-1-41.svg?style=for-the-badge&maxAge=86400)](https://search.maven.org/search?q=g:de.gesellix%20AND%20a:docker-remote-api-model-1-41)

# docker-remote-api

_This project is Work In Progress_

A Docker Remote API model generated from the official OpenAPI spec.
Every engine api version is modeled as dedicated subproject and published artifacts.

## Usage

Consumers can choose a matching api model by specifying the correct library.
The api version is part of the artifact-id, so that we're able to evolve
each api model independently. See the examples below how to include the model
in your project.

Gradle:

```groovy
implementation("de.gesellix:docker-remote-api-model-1-41:[2021-10-16T19-28-00,)")
```

Maven:

```xml
<dependency>
    <groupId>de.gesellix</groupId>
    <artifactId>docker-remote-api-model-1-41</artifactId>
    <version>[2021-10-16T19-28-00,)</version>
</dependency>
```

## API Documentation

- Official documentation: https://docs.docker.com/engine/api/
- API reference (latest release): https://docs.docker.com/engine/api/latest/
- API reference source: https://github.com/moby/moby/blob/master/api/swagger.yaml

## Publishing/Release Workflow

See RELEASE.md

## Contact

Please leave feedback, ideas for improvements, or bug reports as [issues](https://github.com/docker-client/docker-remote-api/issues).

Feel free to submit [pull requests](https://github.com/docker-client/docker-remote-api/pulls)!
See [CONTRIBUTING](CONTRIBUTING.md) for details how to apply api or code changes.

I'm available at Twitter [@gesellix](https://twitter.com/gesellix), too.

## License

See the [LICENSE](LICENSE) file.
