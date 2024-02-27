pipeline{
    agent{label 'jenkin-agent'}
    tools{
        jdk 'Java17'
        maven 'Maven3'
    }
    stages{
        stage("Cleanup Workspace"){
            steps{
               CleanWs()
            }
        }
        stage("Checkout from SCM"){
            steps{
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/Itsmanjitsharma/virtualDemoApp'
            }
        }
        stage("Build Application"){
            steps{
                sh "mvn clean package"
            }
        }
        stage("Test Application"){
                steps{
                    sh "mvn test"
                }
        }
    }
}