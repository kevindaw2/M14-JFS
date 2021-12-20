from django.template import Template, Context
from django.template.loader import get_template #importamos la plantilla 
from django.shortcuts import render
from django.http import HttpResponse, request
from gestion.models import Articulos, Clientes

# Create your views here.

def saludar (request):
    htmlHola = "<h1>Hola mundo</h1>"
    return HttpResponse(htmlHola)

def despedir (request):
    return HttpResponse("Adios Mundo")

def params (request, anyo, mes): #params a través del url 
    htmlH1 = "<h1> Año: %s del mes %s </h1>" %(anyo, mes)
    return HttpResponse(htmlH1)

def saludo(request): #primera vista plantilla
    doc_externo=open('/var/www/projects/djangoProject/djangoProject/templates/vista.html')
    plantilla = Template(doc_externo.read())
    doc_externo.close() 
    ctx = Context()
    documento = plantilla.render(ctx)
    return HttpResponse(documento)

class Persona: #creamos una clase
    def __init__(self, nombre, apellido): #constructor
        self.nombre = nombre; 
        self.apellido = apellido

def cargarPlantilla(request):
    persona = Persona('Kevin', 'Vanegas')
    ciudades = ['Valencia', 'Barcelona', 'Madrid']
    return render(request, 'vista.html', {'ciudades':ciudades, 'persona':persona})

def insertarArticulos(request): #metodo para la view
    art = Articulos(nombre='madera', seccion='carpinteria', precio='65', tlf='93123456')
    art.save()