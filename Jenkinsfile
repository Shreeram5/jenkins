pipeline{

    agent any
    tools{
        maven "maven"
    }
    stages{

        stage("SCM checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/develop']], extensions: [],
                userRemoteConfigs: [[url: 'https://github.com/Shreeram5/jenkins']])
            }
        }

        stage("Build Process"){
            steps{
                script{
                    bat 'mvn clean install'
                }
            }
        }

        stage("Deploy to Container"){
            steps{
                script{
                    deploy adapters: [tomcat9(credentialsId: 'tomcat-pwd', path: '', url: 'http://localhost:9090')], contextPath: 'JenkinsCICD', war: '**/*war'
                }
            }
        }
    }