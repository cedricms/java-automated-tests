package com.automated.tests.unit.fibonacci

import org.slf4j.{Logger, LoggerFactory}

class Fibonacci() {
}

object Fibonacci {
    private val logger: Logger = LoggerFactory.getLogger(classOf[Fibonacci])

    def main(args: Array[String]): Unit = {
        logger.info("Hello Fibonacci!")
    }
}
