# scala-mm.g8
![ci](https://github.com/reminia/scala-mm.g8/actions/workflows/ci.yml/badge.svg)

A multi-module Scala project g8 template. Try it with:

```bash
sbt new reminia/scala-mm.g8
```

## Features

* multi-module project with 2 sample modules: core and api.
* publish to github package registry, try `sbt publish`.
* format code with scalafmt, see the [conf](src/main/g8/.scalafmt.conf), try `sbt scalafmt`.
* ci pipeline, see [ci.yml](src/main/g8/.github/workflows/ci.yml).
* release pipeline, see [release.yml](src/main/g8/.github/workflows/release.yml).
