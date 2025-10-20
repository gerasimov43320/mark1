node {
    stage('Apply Kubernetes files') {
        withKubeConfig([credentialsId: 'k3', serverUrl: 'https://192.168.31.73:6443']) {
            sh 'kubectl apply -f https://raw.githubusercontent.com/gerasimov43320/mark1/refs/heads/main/nginx_pod.yaml'
        }
    }
}