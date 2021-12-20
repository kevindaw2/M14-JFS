from django.db import models

# Create your models here.

#Clientes 

class Clientes(models.Model):
    nombre=models.CharField(max_length=30)
    direccion=models.CharField(max_length=30)
    email=models.EmailField()
    tlf=models.IntegerField()

#Articulos

class Articulos(models.Model):
    nombre = models.CharField(max_length=30)
    seccion = models.CharField(max_length=30)
    precio = models.IntegerField()
    tlf = models.IntegerField()

#Una vez creado los modelos generamos las Migraciones