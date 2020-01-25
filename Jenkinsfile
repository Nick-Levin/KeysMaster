pipeline {
    agent {
        docker { image 'gradle:6.0.1-jdk8'}
    }

    stages {
        stage('Compile') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'gradle test'
            }
        }

        stage('Execute') {
            steps {
                sh 'gradle run'
            }
        }

        stage('Upload Artifact') {
            steps {
                Artifactory.server('Main-Artifactory').upload("""{
                    "files": [
                        {
                            "pattern": "**.jar",
                            "target": "Keys-Master/"
                        }
                    ]
                }""")
            }
        }
    }
}
