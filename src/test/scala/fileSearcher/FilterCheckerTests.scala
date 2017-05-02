package fileSearcher


import java.io.File

import org.scalatest.FlatSpec

/**
  * Created by work on 02/05/2017.
  */
class FilterCheckerTests extends FlatSpec {
  "ilterChecker passed a list where one file matches the filter" should
  "return a list with that file" in {
    val listOfFiles = List( FileObject(new File ("random")),
      FileObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(FileObject(new File("match"))))
  }

  "FilterChecker passed a list with a directory that matches the filter" should
  "should not return the directory" in {
    val listOfIOBjects = List( FileObject(new File ("random")),
       DirectoryObject(new File ("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOBjects
    assert(matchedFiles.length == 0)
  }
}
