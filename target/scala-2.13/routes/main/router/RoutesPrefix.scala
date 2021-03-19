// @GENERATOR:play-routes-compiler
// @SOURCE:D:/perso/play-api/conf/routes
// @DATE:Wed Mar 10 20:19:19 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
