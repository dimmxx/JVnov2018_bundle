#!/bin/bash

git add *
git commit -m "$(whoami)"
git push origin master
