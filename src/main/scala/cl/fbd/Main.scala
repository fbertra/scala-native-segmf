package cl.fbd

import scalanative.native._
import scalanative.libc.stdlib._

object Main {
  def main (args : Array [String]) = {
    // val len = 2
    val len = args.length

    fprintf(stdout, c"Hello bare metal\n")

    if (len == 0)
      fprintf(stdout, c"No args\n")
    
    else
      fprintf(stdout, c"%d args\n", len)
      
    ()
  }
}
