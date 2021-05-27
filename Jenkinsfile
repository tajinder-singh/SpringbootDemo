pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/tajinder-singh/SpringbootDemo.git'
            }
        }
        stage('Build') {
            steps {
                mvn 'mv package'
            }
        }
        //stage('Deploy') {
          //  steps {
            //    echo 'Deploying....'
            //}
        //}
    }
}
