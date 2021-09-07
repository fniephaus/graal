# [![GraalVM](.github/assets/logo_320x64.svg)](https://www.graalvm.org/)

[![https://graalvm.slack.com](https://img.shields.io/badge/slack-join%20channel-active)](https://www.graalvm.org/slack-invitation/)

GraalVM is a high-performance JDK distribution designed to accelerate the execution of applications written in Java and other JVM languages along with support for JavaScript, Ruby, Python, and a number of other popular languages.

The project website at [https://www.graalvm.org/](https://www.graalvm.org/) describes how to [get started](https://www.graalvm.org/docs/getting-started/), how to [stay connected](https://www.graalvm.org/community/), and how to [contribute](https://www.graalvm.org/community/contributors/).

## Documentation

Please refer to the official [GraalVM documentation on the GraalVM website](https://www.graalvm.org/docs/introduction/). You can find most of the documentation sources in the [`docs/`](docs/) directory in the same hierarchy as displayed on the website. Additional documentation sources for individual components can be found in corresponding `docs/` sub-directories. The documentation for the Truffle framework, for example, can be found in [`truffle/docs/`](truffle/docs). This also applies to languages, tools, and other components maintained in [related repositories](#related-repositories).

## Repository Structure

The GraalVM main source repository includes the components listed below. The documentation for each component includes
developer instructions for the component.

Directory | Description
------------ | -------------
[`.github/`](.github/) | Configuration files for GitHub issues, workflows, … .
[`compiler/`](compiler/) | [Graal compiler](https://www.graalvm.org/reference-manual/compiler/), a modern, versatile compiler written in Java.
[`espresso/`](espresso/) | [Espresso](https://www.graalvm.org/reference-manual/java-on-truffle/), a meta-circular Java bytecode interpreter for the GraalVM.
[`examples/`](examples/) | Various examples.
[`java-benchmarks/`](java-benchmark/) | Java benchmarks.
[`regex/`](regex/) | TRegex, a regular expression engine for other GraalVM languages.
[`sdk/`](sdk/) | [GraalVM SDK](https://www.graalvm.org/sdk/javadoc/), long-term supported APIs of GraalVM.
[`substratevm/`](substratevm/) | Framework enabling ahead-of-time (AOT) compilation with [Native Image](https://www.graalvm.org/reference-manual/native-image/).
[`sulong/`](sulong/) | [Sulong](https://www.graalvm.org/reference-manual/llvm/), an engine for running LLVM bitcode on GraalVM.
[`tools/`](tools/) | A set of tools for GraalVM languages implemented with the instrumentation framework.
[`truffle/`](truffle/) | [Language implementation framework](https://www.graalvm.org/graalvm-as-a-platform/language-implementation-framework/) for creating languages and instrumentations for GraalVM.
[`vm/`](vm/) | The components to build a modular GraalVM image.
[`wasm/`](wasm/) | [GraalWasm](https://www.graalvm.org/reference-manual/wasm/), an engine for running WebAssembly programs on GraalVM.

## Get Support

* Open a [GitHub issue](https://github.com/oracle/graal/issues) for bug reports, questions, or requests for enhancements.
* Report a security vulnerability according to the [Reporting Vulnerabilities guide](https://www.oracle.com/corporate/security-practices/assurance/vulnerability/reporting.html).

## Related Repositories

GraalVM provides additional languages, tools, and other components developed in related repositories. These are:

Name         | Description
------------ | -------------
[FastR](https://github.com/oracle/fastr) | Implementation of the R language.
[GraalJS](https://github.com/oracle/graaljs) | Implementation of JavaScript and Node.js.
[GraalPython](https://github.com/oracle/graalpython) | Implementation of the Python language.
[Native Build Tools](https://github.com/graalvm/native-build-tools) | Build tool plugins for GraalVM Native Image.
[SimpleLanguage](https://github.com/graalvm/simplelanguage) | A simple demonstration language for the GraalVM.
[TruffleRuby](https://github.com/oracle/truffleruby) | Implementation of the Ruby language.
[VS Code Extensions](https://github.com/graalvm/vscode-extensions) | VS Code extensions for GraalVM.


## License

GraalVM Community Edition is open source and distributed under [version 2 of the GNU General Public License with the “Classpath” Exception](LICENSE), which are the same terms as for Java. The licenses of the individual GraalVM components are generally derivative of the license of a particular language (see the table below). GraalVM Community is free to use for any purpose - no strings attached.

Component(s) | License
------------ | -------------
[Espresso](espresso/LICENSE) | GPL 2
[GraalVM Compiler](compiler/LICENSE.md), [SubstrateVM](substratevm/LICENSE), [Tools](tools/LICENSE), [VM](vm/LICENSE_GRAALVM_CE) | GPL 2 with Classpath exception
[GraalVM SDK](sdk/LICENSE.md), [GraalWasm](wasm/LICENSE), [Truffle Framework](truffle/LICENSE.md), [TRegex](regex/LICENSE.md) | Universal Permissive License
[Sulong](sulong/LICENSE) | 3-clause BSD
