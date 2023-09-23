# TreeCommandLib

TreeCommandLib is a Bukkit plugin version of the [TreeCommand](https://github.com/XAS-Dev/TreeCommand) project. Installing this plugin on your server allows other plugins that depend on the [TreeCommand](https://github.com/XAS-Dev/TreeCommand) project to use [TreeCommand](https://github.com/XAS-Dev/TreeCommand) as a 'provided' dependency in their pom.xml files, rather than a 'compile' dependency. This can help reduce plugin conflicts and streamline your Bukkit plugin setup.

## Getting Started

To use TreeCommandLib in your Spigot plugin project, you can add the [TreeCommand](https://github.com/XAS-Dev/TreeCommand) project as a dependency in your `pom.xml` file. First, add the XAS repository to your repositories section:

```xml
        <repository>
            <id>xas</id>
            <url>https://maven.xasmc.xyz/repository/xas/</url>
        </repository>
```

Next, add TreeCommand as a dependency:

```xml
        <dependency>
            <groupId>xyz.xasmc</groupId>
            <artifactId>TreeCommand</artifactId>
            <version>FILL_IN_THE_VERSION_NUMBER_HERE</version>
            <scope>provided</scope>
        </dependency>
```

Unlike the TreeCommand project, it uses `<scope>provided</scope>` instead of `<scope>compile</scope>`

## Usage Example

[🔗 Please read this document](https://github.com/XAS-Dev/TreeCommand#usage-example)
