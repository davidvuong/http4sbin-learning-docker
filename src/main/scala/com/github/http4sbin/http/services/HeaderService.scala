package com.github.http4sbin.http.services

import org.http4s.HttpService
import org.http4s.dsl._

import argonaut._, Argonaut._

import com.github.http4sbin.http.ArgonautInstances._
import com.github.http4sbin.http.Http4sHelpers.HeadersEncodeJson

object HeaderService {

  val service = HttpService {
    case req @ GET -> Root / "headers" => {
      Ok(req.headers.asJson)
    }
  }
}
