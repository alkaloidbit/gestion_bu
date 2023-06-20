#!/bin/bash

mysql -u root -pRvTC6F8D < /home/fred-badlieutenant/IdeaProjects/gestion_bu/sql/install_db.sql
echo './install_db: Db reinit.'
mysql -u root -pRvTC6F8D < /home/fred-badlieutenant/IdeaProjects/gestion_bu/sql/fixtures.sql
echo './fixtures.sql: Db populated with fixtures data.'

