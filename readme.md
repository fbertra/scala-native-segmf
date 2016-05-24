Case for issue #

../scala-native-segm$ sbt run
[info] Loading project definition from /home/francois/proyectos/pruebas/scala-native-segm/project
[info] Set current project to scala-native-segmf (in build file:/home/francois/proyectos/pruebas/scala-native-segm/)
[info] Compiling 1 Scala source to /home/francois/proyectos/pruebas/scala-native-segm/target/scala-2.11/classes...
warning: overriding the module target triple with x86_64-pc-linux-gnu [-Woverride-module]
1 warning generated.
[success] Total time: 16 s, completed May 24, 2016 4:41:14 AM
francois@ubuntu:~/proyectos/pruebas/scala-native-segm$ ./target/scala-2.11/scala-native-segmf-out 
Segmentation fault (core dumped)Segmentation fault (core dumped)

#  execution with
#  val len = 2 
#  // val len = args.length
../scala-native-segm$ sbt run
[info] Loading project definition from /home/francois/proyectos/pruebas/scala-native-segm/project
[info] Set current project to scala-native-segmf (in build file:/home/francois/proyectos/pruebas/scala-native-segm/)
[info] Compiling 1 Scala source to /home/francois/proyectos/pruebas/scala-native-segm/target/scala-2.11/classes...
warning: overriding the module target triple with x86_64-pc-linux-gnu [-Woverride-module]
1 warning generated.
Hello bare metal
2 args
