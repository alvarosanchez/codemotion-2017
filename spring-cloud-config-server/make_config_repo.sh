#!/usr/bin/env bash

REPO_DIR=/tmp/config-repo

rm -rf $REPO_DIR
mkdir $REPO_DIR
cd $REPO_DIR
git init .
echo global.greeting: Hola > application.properties
echo conference.title: Codemotion 2017 > configclient1.properties
echo local.message: This is only in development > configclient1-development.properties
git add -A .
git commit -m "Add properties files"