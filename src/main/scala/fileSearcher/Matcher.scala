package fileSearcher

import java.io.File

/**
  * Created by work on 02/05/2017.
  */
class Matcher(filter: String, rootLocation : String) {
  val rootIOObject = FileConverter.convertToIOOject(new File(rootLocation))

  def execute() = {
    val matchedFiles = rootIOObject match {
      case file : FileObject if FilterChecker(filter) matches file.name => List(file)
      case directory : DirectoryObject => ???
      case _ => List()
    }

    matchedFiles map(iOObject => iOObject.name)
  }
}
