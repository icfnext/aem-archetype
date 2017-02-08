# AEM Maven Archetype

[Olson Digital](http://www.digitalatolson.com/)

## Compatibility

For use with AEM 6.2

## Dependency Versions

| Dependency  | Version |
| ----------- | ------- |
| AEM Library | 8.0.2  |
| Multicomposite Add On | 2.1.3 |
| CQ Component Maven Plugin | 4.2.0 |
| OSGi Bundle Status Maven Plugin | 2.0.2 |
| AEM Package Maven Plugin | 0.6.0 |

## Example Usage

`mvn archetype:generate -DarchetypeGroupId=com.icfolson.aem -DarchetypeArtifactId=aem-maven-archetype -DarchetypeVersion=2.0.0 -DgroupId=com.clientname -DartifactId=clientname -DclientPrettyName="The Name of The Client" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false`

## Versioning

Follows [Semantic Versioning](http://semver.org/) guidelines.