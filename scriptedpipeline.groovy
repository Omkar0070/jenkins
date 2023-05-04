node{
    stage ('Pull'){
        echo 'hello world'
    }
    stage ('Build'){
        echo 'Congrats! build is done'    
    }
    stage ('Test'){
        echo 'test is done'
    }
    stage ('deploy'){
        echo 'deploy successfull'
    }   
}