package GatoPlayero

import org.apache.log4j.Level
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import java.util.concurrent.Executors

object Application {
	def main(args: Array[String]): Unit = {
		//
		// review incoming parameters
		if (args != null) {
			if (args.length > 0) {
				for (currentArg <- args) {
					println("Current Argument : %s".format(currentArg))
				}
			}
		}
		// define logger level
		val logger = org.apache.log4j.Logger.getLogger("org/apache/spark/log4j-defaults.properties")
		logger.setLevel(Level.WARN)
		//
		// define local session
		val _SparkSession = SparkSession.builder().getOrCreate()
		//
		// print message
		println("Hello Gatito on Spark Version 3.3.2 !!!")
		//
	}
}