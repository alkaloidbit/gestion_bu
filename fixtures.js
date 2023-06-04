const sqlFixtures = require('sql-fixtures');

const dbConfig = {
	client: 'mysql',
	connection: {
		host: 'localhost',
		user: 'root',
		password: 'RvTC6F8D',
		database: 'GESTION_BU',
		port: 3306
	}
};

const dataSpec = {
	UTILISATEUR: {
		id_profile: 1,
		nom: 'oudjoudi',
		prenom: 'frederic',
		email: 'fredoudjoudi@gmail.com',
		password: 'aliboulala'
	}
};

sqlFixtures.create(dbConfig, dataSpec, function(err, result) {
	console.log(err);
	console.log(result.UTILISATEUR[0].email);
})


