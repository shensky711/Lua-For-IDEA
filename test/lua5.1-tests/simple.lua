-- I am testing globals/locals

function a(b,c,d)
  a,b = c,d
  return self
end

local function a()
  a,b = c,d
  return self
end

local t = {}
function t:b(c,d)
  return self
end

local foo = foo


local a,b,c,d,e,f = 1,2,3,4







        