# AEM Maven Archetype

[Olson Digital](http://www.digitalatolson.com/)

## Compatibility

For use with AEM 6.3

## Dependency Versions

| Dependency  | Version |
| ----------- | ------- |
| AEM Library | 9.2.0 |
| Multicomposite Add On | 3.2.2 |
| CQ Component Maven Plugin | 5.0.1 |
| OSGi Bundle Status Maven Plugin | 2.0.2 |
| AEM Package Maven Plugin | 0.6.0 |

## Example Usage

`mvn archetype:generate -DarchetypeGroupId=com.icfolson.aem -DarchetypeArtifactId=aem-maven-archetype -DarchetypeVersion=2.0.0 -DgroupId=com.clientname -DartifactId=clientname -DclientPrettyName="The Name of The Client" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false`

## Versioning

Follows [Semantic Versioning](http://semver.org/) guidelines.