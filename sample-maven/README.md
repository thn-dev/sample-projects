sample-maven
============

## projects
- **single** - single moodule project
- **multi_1** - multi-module project using {root, parent, bom, and child modules}
- **multi_2** - multi-module project using {parent, bom, bom-internal, and child modules}

## Useful maven commands
- mvn dependency:tree
- mvn dependency:tree -Dincludes=[groupId]:[artifactId]:[type]:[version]
- mvn -am -pl <module> { compile | package }
- mvn -amd -pl <module> { compile | package }

## References
- [dependency plugin](https://maven.apache.org/plugins/maven-dependency-plugin/index.html)
- [exclude dependencies](https://maven.apache.org/plugins/maven-dependency-plugin/examples/exclude-dependencies-from-dependency-analysis.html)
- [filtering](https://maven.apache.org/plugins/maven-dependency-plugin/examples/filtering-the-dependency-tree)
- [resolving conflicts](https://maven.apache.org/plugins/maven-dependency-plugin/examples/resolving-conflicts-using-the-dependency-tree.html)
- [purging local repository dependencies](https://maven.apache.org/plugins/maven-dependency-plugin/examples/purging-local-repository.html)