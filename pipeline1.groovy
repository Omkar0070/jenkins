pipeline {
    agent any
    stages{
        stage ('Pull'){
            steps{
                echo 'Pull Success'
            }
        }
        stage ('Build'){
            steps{
                echo 'Congrats! Build is done'
            }
        }
        stage ('Test'){
            steps{
                echo 'Test is successfull' 
            }
        }
        stage('Depoly'){
            steps{
                echo 'Deploy is successfull'  

            }
        }
    }
}