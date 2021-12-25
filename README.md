# Exemplos

> [POST] http://localhost:8080/api/v1/oficinas
```json
{
    "codigoOficina": "BRASILIENSE",
    "nome": "Oficina Corrupta",
    "especialidade": "Carro normal",
    "endereco": "Congresso nacional",
    "carro": {
        "ano": 2020,
        "anomodelo": 2019,
        "cor": "azul",
        "marca": "bmw",
        "modelo": "camaro",
        "placa": "ABC21"
    }
}
```

> [POST] http://localhost:8080/api/v1/clientes

```json
{
    "nome": "Carlos",
    "cpf": "10214521",
    "dataNascimento": "2021-12-24",
    "carro": {
        "ano": 2018,
        "anomodelo": 2012,
        "cor": "amarelo",
        "marca": "bmw",
        "modelo": "camaro",
        "placa": "ABC21"
    }
}
```
