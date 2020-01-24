pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Execute') {
            steps {
                sh 'gradle run'
            }
        }
    }
}