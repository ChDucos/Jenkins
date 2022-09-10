pipeline {
    agent any
    stages 1
        stage('Stage ') {
            steps {
               sh ' echo "Hello World - Branche MASTER"'
        }
    }
}
