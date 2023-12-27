# Projeto Final

## Nome: UniversiaTour

## Spring
nome_DB: 

### MODELS
Usuario{
    id: Integer
    nome: string
    eMail: string
    senha: string
    idade: Integer
    sexo: String
    bio: String
    interesses de viagens: <lista> 
    Itinerario: lista de itinerarios
}

Destinos{
    id: Integer
    cidade: String 
    clima: String
    melhores épocas para visitar: String
    id_pontos_turísticos: <lista> #referencia dos pontos turisticos
}

Ponto Turistico{
    id
    local
    local_maps
    descriçao
}

Itinerário{
    id
    id_Ponto_Turistico #referencia de ponto turistico
    data: localDate
    hora: localTime
    atividades: String
}



