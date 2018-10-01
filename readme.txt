jpa: java persistant api
used to fetch data from database
Autowired:we can inject the controoler directly in repository with creating the instance(like static)
if we write @Entity on any class spring is going to use that for jpa


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
it generates id automatically for every call
spring is a intermediate layer framework using which we can extractc data from database without querying.
@Restcontroller uses spring mvc
spring batch is going to get trigger automatically.
So u need to make it false(in spring-batch-csv folder) application.properties.
JobBuilderFactory is going to create job in spring boot

incrementer:: everytime when you run the batch it will be incremented by one
flow or start to run the batch
