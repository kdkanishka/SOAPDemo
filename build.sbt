name := "SOAPDemo"

version := "1.0"

val cxfVersion = "3.0.3"

libraryDependencies += Seq(
  "org.apache.cxf" % "cxf-rt-frontend-jaxws" % cxfVersion,
  "org.apache.cxf" % "cxf-rt-transports-http" % cxfVersion,
  "org.apache.cxf" % "cxf-rt-transports-http-jetty" % cxfVersion
)


    