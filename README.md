AEM Maven Archetype
=============
For use with AEM 6.1

AEM Library
-----------
Currently using library version 6.0.0

CQ Component Maven Plugin
----------
Currently using library version 4.0.0

Multicomposite Add On
----------
Currently using library version 2.0.1

Example Usage:
--------------

mvn archetype:generate -DarchetypeGroupId=com.citytechinc.aem -DarchetypeArtifactId=aem-maven-archetype -DarchetypeVersion=1.3.0 -DgroupId=com.clientname -DartifactId=clientname -DclientPrettyName="The Name of The Client" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false
