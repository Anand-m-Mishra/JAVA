# Maven:
- It is a build management tool.
- It is used to manage the project build, reporting, and documentation.
- It defines how your .java file compile into .class file and package into .jar/.war/.ear files.
- All the build tasks are automated using *maven*
# steps during making a build:
- Downloading dependencies.
- Adding additional jars on classpath, compiling source code into binarycode.
- Running tests.
- Packaging compiled code into deployable artifacts such as jar or war files.
- Deploying these artifacts to into application servers

# Spring Framework:
- It helps the devs to work on only the functional part of the project rather than worrying about non-functional code.
- It minimizes boilerplate java code.
- It is a dependency injection framework.
- Allows to make decoupled systems.
# Why we need Spring in java?:
- It externalizes the object formations and calling.
# IoC container:
- Inversion of control.
 # Responsibilities:
 - Instantiate,
 - Configure 
 - Assemble the objects.
- it is configured using :
 - XML
 - Annotations
 - Java configuration classes.
# Types:
 - *Bean factory*:
  - It is the most basic type.
  - used only when the memory consumption is critical.
 - *Application Context*:
 - It is the most commonly used type.
 - Extends bean factory.
 - it is way to implement ioc container.

