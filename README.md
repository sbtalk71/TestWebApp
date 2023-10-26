# TestWebApp
Test Web Application for Jenkins, Docker CI/CD

 stage("docker_build"){
            steps{
            bat "docker build -t sbtalk71/myapp:$BUILD_NUMBER ."
            }
        }
        stage("Push"){
        steps {
        withDockerRegistry([ credentialsId: "dockerCreds", url: "" ]) {
          bat 'docker push sbtalk71/myapp:$BUILD_NUMBER'
        }
      }
