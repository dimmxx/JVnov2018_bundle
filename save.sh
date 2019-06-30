#!/bin/bash

git add *
git commit -m "$(pwd) $(date)"
git push origin master
