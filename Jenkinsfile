pipeline {
    agent {
        docker {
            image 'gradle:6.0.1-jdk8'
        }
    }

    parameters {
        booleanParam(name: 'UnitTests', defaultValue: false, description: 'Run/Skip unit tests')
    }

    stages {
        stage('Compile') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Unit Tests') {
            when {
                expression {
                    params.UnitTests
                }
            }
            steps {
                sh 'gradle test'
            }
        }

        stage('Upload Artifact') {
            steps {
                rtUpload (
                    serverId: 'Main-Artifactory',
                    spec: '''
                        {"files": [
                            {
                                "pattern": "./build/libs/keysMaster-*.jar",
                                "target": "Keys-Master/org/"
                            }
                        ]}
                    ''',
                    failNoOp: true
                )
            }
        }
    }
}
