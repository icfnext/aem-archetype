# AEM Maven Archetype

[Olson Digital](http://www.digitalatolson.com/)

## Compatibility

For use with AEM 6.4.

Archetype Version(s) | AEM Version(s)
------------ | -------------
4.x.x | 6.3, 6.4, 6.5
3.0.0 | 6.3
2.x.x | 6.2
1.3.0 | 6.1
1.2.x, 1.1.0, 1.0.0 | 6.0

## Dependency Versions

| Dependency  | Version |
| ----------- | ------- |
| AEM Core Components | 2.3.2 |
| AEM Library | 12.0.0 |
| CQ Component Maven Plugin | 6.4.0 |
| OSGi Bundle Status Maven Plugin | 2.0.2 |
| Prosper | 14.0.0 |


## Example Usage

`mvn archetype:generate -DarchetypeGroupId=com.icfolson.aem -DarchetypeArtifactId=aem-maven-archetype -DarchetypeVersion=4.0.0 -DgroupId=com.clientname.aem -DartifactId=clientname -Dpackage=com.icfolson.aem.clientname.core -DclientPrettyName="The Name of The Client" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false`

## Versioning

Follows [Semantic Versioning](http://semver.org/) guidelines.