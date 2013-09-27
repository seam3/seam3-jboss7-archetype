seam3-jboss7-archetype
======================

Archetype para aplicativos Seam3 no JBoss 7, conforme arquitetura definida segundo princípios do DDD

Características do projeto:

Weld CDI + JSF 2.0
Seam Solder
Seam Persistence
Seam Transaction
Seam Security
Hibernate 4
Primefaces 3
Richfaces 4
RestEasy Webservices

Instalação
============

Execute mvn install para instalar o archetype no repositório maven local

Crie um projeto

mvn archetype:generate -DarchetypeGroupId=br.jus.trese -DarchetypeArtifactId=seam3-jboss7-archetype -DarchetypeVersion=0.1-SNAPSHOT

Importe o projeto no Eclipse


Criando um novo projeto no Eclipse
==================================

Execute mvn install para instalar o archetype no repositório maven local

Vá em Preferences > Maven > Archetypes e Add Local Catalog
Selecione o catálogo do arquivo (archetype-catalog.xml)
Crie um novo Maven project e selecione o archetype (lembre de selecionar "Include snapshot archetypes").