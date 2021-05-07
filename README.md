# Semana [DevSuperior](https://github.com/devsuperior) 3.0
Realizada entre 03 a 09 de abril de 2021 (Desta vez estou conseguindo acompanhar ao vivo, quer dizer, quase)
Projeto desenvolvido sob a tutoria de [Nelio Alves](https://github.com/acenelio) no Backend em Java com Spring Boot e 
no Frontend com ReactJs.

[![Linkedin](https://img.shields.io/badge/Made%20by-Tarcnux-deepskyblue)](https://www.linkedin.com/in/tarcnux) [![Twitter](https://img.shields.io/twitter/follow/tarcnux?style=social)](https://www.twitter.com/tarcnux)

## Repo projeto-sds3
Aplicação Web Dashboard de vendas com gráficos [Apexcharts](https://apexcharts.com/docs/react-charts/) e exibição de tabela de vendas com paginação.
Backend em Java com Spring Boot, Frontend em ReactJS com Typescript e Banco de Dados Heroku PostgreSQL

### Modelo conceitual         
![Image](https://raw.githubusercontent.com/tarcnux/projeto-sds3/main/images/sds3-mc.png "Modelo conceitual")

### Padrão em camadas adotado
![Image](https://raw.githubusercontent.com/tarcnux/projeto-sds3/main/images/camadas.png "Padrão camadas")

- Repositórios (Acesso aos dados no banco de dados)
- DTO's (Objetos que carregam os dados entre as camadas de serviço e contraladores)
- Serviços (Manipula os dados do banco e converte para DTO)
- Controladores (Interface REST)

## API Rest em Java
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/b5df25a02da2a90cf2b1)

Backend Heroku: https://sds3-tarcnux.herokuapp.com/ [![Heroku](https://heroku-badge.herokuapp.com/?app=heroku-badge&style=flat)](https://sds3-tarcnux.herokuapp.com/sellers)

**Listar Vendas Paginada**
----
  Retorna um json com a primeira página de vendas.

* **URL**

  [/sales?page=0&size=2](https://sds3-tarcnux.herokuapp.com/sales?page=0&size=2)

* **Metódo:**

  `GET` 

* **Resposta em caso de sucesso:**

  * **Código:** 200 OK<br />
    **Conteúdo:** 
    ```
      {
          "content": [
              {
                  "id": 1,
                  "visited": 83,
                  "deals": 66,
                  "amount": 5501.0,
                  "date": "2021-04-01",
                  "seller": {
                      "id": 5,
                      "name": "Padme"
                  }
              },
              {
                  "id": 2,
                  "visited": 113,
                  "deals": 78,
                  "amount": 8290.0,
                  "date": "2021-03-31",
                  "seller": {
                      "id": 5,
                      "name": "Padme"
                  }
              }
          ],
          "pageable": {
              "sort": {
                  "sorted": false,
                  "unsorted": true,
                  "empty": true
              },
              "pageNumber": 0,
              "pageSize": 2,
              "offset": 0,
              "paged": true,
              "unpaged": false
          },
          "last": false,
          "totalPages": 85,
          "totalElements": 170,
          "sort": {
              "sorted": false,
              "unsorted": true,
              "empty": true
          },
          "first": true,
          "number": 0,
          "numberOfElements": 2,
          "size": 2,
          "empty": false
      }
    ```

**Listar Vendedores**
----
  Retorna um json com todos os vendedores.

* **URL**

  [/sellers](https://sds3-tarcnux.herokuapp.com/sellers)

* **Method:**

  `GET` 

* **Resposta em caso de sucesso:**

  * **Código:** 200 OK<br />
    **Conteúdo:** 
    ```
    [
          {
            id: 1,
            name: "Logan"
          },
          {
            id: 2,
            name: "Anakin"
          },
          {
            id: 3,
            name: "BarryAllen"
          },
          {
            id: 4,
            name: "Kal-El"
          },
          {
            id: 5,
            name: "Padme"
          }
    ]
    ```

**Vendas por vendedores**
----
  Retorna um json com a quantidade de venda somada e agrupada para cada vendedor

* **URL**

  [/sales/amount-by-seller](https://sds3-tarcnux.herokuapp.com/sales/amount-by-seller)

* **Method:**

  `GET` 

* **Resposta em caso de sucesso:**

  * **Código:** 200 OK<br />
    **Conteúdo:** 
    ```
    [
        {
          sellerName: "Logan",
          sum: 220426
        },
        {
          sellerName: "BarryAllen",
          sum: 499928
        },
        {
          sellerName: "Padme",
          sum: 473088
        },
        {
          sellerName: "Kal-El",
          sum: 444867
        },
        {
          sellerName: "Anakin",
          sum: 477138
        }
    ]
    ```    

**Sucesso nas vendas**
----
  Retorna um json com a soma de pedidos fechados e visitas feitas.

* **URL**

  [/sales/success-by-seller](https://sds3-tarcnux.herokuapp.com/sales/success-by-seller)

* **Method:**

  `GET` 

* **Resposta em caso de sucesso:**

  * **Código:** 200 OK<br />
    **Conteúdo:** 
    ```
    [
        {
          sellerName: "Logan",
          visited: 1495,
          deals: 684
        },
        {
          sellerName: "BarryAllen",
          visited: 3385,
          deals: 2164
        },
        {
          sellerName: "Padme",
          visited: 3426,
          deals: 2369
        },
        {
          sellerName: "Kal-El",
          visited: 3040,
          deals: 1958
        },
        {
          sellerName: "Anakin",
          visited: 2396,
          deals: 1028
        }
    ]
    ```      
    
## Website [![Netlify Status](https://api.netlify.com/api/v1/badges/8f014662-03e5-4b11-b3f9-c01125d8d260/deploy-status)](https://app.netlify.com/sites/tarcnux-sds3/deploys)
Ainda com dados estáticos, a integração só será feita na sexta-feira 08/05
Frontend no Netlify: https://tarcnux-sds3.netlify.app/
