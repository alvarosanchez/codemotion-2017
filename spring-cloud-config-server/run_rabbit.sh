#!/usr/bin/env bash

docker run -d --hostname rabbitmq -p 5672:5672 --name rabbitmq rabbitmq:latest
