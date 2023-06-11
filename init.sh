#!/bin/bash

mysql -u root -pRvTC6F8D < /home/fred-badlieutenant/IdeaProjects/UniversityLibrary/sql/install_db.sql
echo 'Db reinit.'
mysql -u root -pRvTC6F8D < /home/fred-badlieutenant/IdeaProjects/UniversityLibrary/sql/fixtures.sql
echo 'Db populated with fixtures data.'

