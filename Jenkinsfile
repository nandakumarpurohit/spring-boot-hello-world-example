pipeline {
	tools {
		maven 'maven3'
	} 
    agent any 
    stages {
        stage('Compile Stage') { 
            steps {
                	sh 'mvn clean compile'
            }
        }
        stage('Testing Stage') { 
            steps {
                	sh 'mvn test'
            }
        }
        stage('Install Stage') { 
            steps {
                	sh 'mvn install'
            }
        }
    }
}
