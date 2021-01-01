sample-maven
============

## projects
- **single** - single moodule project
- **multi_1** - multi-module project using {root, parent, bom, and child modules}
- **multi_2** - multi-module project using {parent, bom, bom-internal, and child modules}

## useful maven commands
- mvn dependency:tree
- mvn dependency:tree -Dincludes=[groupId]:[artifactId]:[type]:[version]
- mvn -am -pl <module> { compile | package }
- mvn -amd -pl <module> { compile | package }

## references
- [dependency plugin](https://maven.apache.org/plugins/maven-dependency-plugin/index.html)
- [exclude dependencies](https://maven.apache.org/plugins/maven-dependency-plugin/examples/exclude-dependencies-from-dependency-analysis.html)
- [filtering](https://maven.apache.org/plugins/maven-dependency-plugin/examples/filtering-the-dependency-tree)
- [resolving conflicts](https://maven.apache.org/plugins/maven-dependency-plugin/examples/resolving-conflicts-using-the-dependency-tree.html)
- [purging local repository dependencies](https://maven.apache.org/plugins/maven-dependency-plugin/examples/purging-local-repository.html)

## multi-module projects
- [https://mkyong.com/maven/maven-how-to-create-a-multi-module-project/](https://mkyong.com/maven/maven-how-to-create-a-multi-module-project/)
- [https://stackoverflow.com/questions/35034544/how-to-structure-a-multi-modules-maven-project-to-compile-it-at-once](https://stackoverflow.com/questions/35034544/how-to-structure-a-multi-modules-maven-project-to-compile-it-at-once)
- [https://everyday.codes/java/creating-production-artifacts-in-a-multi-module-maven-project/](https://everyday.codes/java/creating-production-artifacts-in-a-multi-module-maven-project/)
- [http://andresalmiray.com/multi-module-project-builds-with-maven-and-gradle/](http://andresalmiray.com/multi-module-project-builds-with-maven-and-gradle/)