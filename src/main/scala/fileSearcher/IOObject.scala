package fileSearcher

import java.io.File

trait IOObject {
  val file : File
  val name = file.getName()
}
/**
  * Created by work on 02/05/2017.
  */
case class FileObject(file: File) extends IOObject
case class DirectoryObject(file: File) extends IOObject
