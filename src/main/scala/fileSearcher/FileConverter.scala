package fileSearcher

import java.io.File

/**
  * Created by work on 02/05/2017.
  */
object FileConverter {
  def convertToIOOject(file: File) =
    if(file.isDirectory()) DirectoryObject(file)
    else FileObject(file)
}
