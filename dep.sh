#!/bin/bash

echo "********************"
echo "******开始提交******"
echo "********************"

if ["$1" == ""]
then
	set "默认提交，无特殊信息"

fi

git status
git add .
git commit -m $1
git push 

echo "**********************"
echo "*******提交成功*******"
echo "**********************"


