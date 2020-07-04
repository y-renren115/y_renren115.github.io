class NeottersController < ApplicationController
  
  def index
    @neotters = Neott.all
  end
  
  def new
  end
  
  def create
    Neott.create(neotter_params)
  end
  
  private
  def neotter_params
    params.permit(:text)
  end
end
