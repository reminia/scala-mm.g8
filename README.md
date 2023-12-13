# scala-mm.g8 ![ci](https://github.com/reminia/scala-mm.g8/actions/workflows/ci.yml/badge.svg)

This is a scala2 multi-module g8 template. Try it with:

```bash
sbt new reminia/scala-mm.g8
```

## Features

* multi-module project with 2 sample modules: core and api.
* publish to github package registry.
* ci pipeline, see [ci.yml](src/main/g8/.github/workflows/ci.yml).
* release pipeline, see [release.yml](src/main/g8/.github/workflows/release.yml).
* scalafmt include, see the [conf](src/main/g8/.scalafmt.conf), try `sbt scalafmt`.